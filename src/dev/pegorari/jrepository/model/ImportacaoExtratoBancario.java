package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ImportacaoExtratoBancario extends AbstractSankhyaEntity<ImportacaoExtratoBancario> {
   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public Timestamp getDhAlter() {
        return this.getVo().asTimestamp("DHALTER");
   }

   public void setDhAlter(Timestamp dhAlter) {
        markAsChanged("DHALTER", dhAlter);
   }

   public Timestamp getDhProcesso() {
        return this.getVo().asTimestamp("DHPROCESSO");
   }

   public void setDhProcesso(Timestamp dhProcesso) {
        markAsChanged("DHPROCESSO", dhProcesso);
   }

   public Timestamp getDtImport() {
        return this.getVo().asTimestamp("DTIMPORT");
   }

   public void setDtImport(Timestamp dtImport) {
        markAsChanged("DTIMPORT", dtImport);
   }

   public String getHashArquivo() {
        return this.getVo().asString("HASH_ARQUIVO");
   }

   public void setHashArquivo(String hashArquivo) {
        markAsChanged("HASH_ARQUIVO", hashArquivo);
   }

   public String getNomeArq() {
        return this.getVo().asString("NOMEARQ");
   }

   public void setNomeArq(String nomeArq) {
        markAsChanged("NOMEARQ", nomeArq);
   }

   public BigDecimal getNuImport() {
        return this.getVo().asBigDecimal("NUIMPORT");
   }

   public void setNuImport(BigDecimal nuImport) {
        markAsChanged("NUIMPORT", nuImport);
   }

   public String getProcessado() {
        return this.getVo().asString("PROCESSADO");
   }

   public void setProcessado(String processado) {
        markAsChanged("PROCESSADO", processado);
   }

   @Override
   public String getTableName() {
        return "TGFIEB";
   }

   @Override
   public String getEntityName() {
        return "ImportacaoExtratoBancario";
   }

   @Override
   public ImportacaoExtratoBancario fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
