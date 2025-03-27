package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ArquivoAnexoECD extends AbstractSankhyaEntity<ArquivoAnexoECD> {
   public String getDescricao() {
        return this.getVo().asString("DESCRICAO");
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
   }

   public String getNomeArquivoSkw() {
        return this.getVo().asString("NOMEARQUIVOSKW");
   }

   public void setNomeArquivoSkw(String nomeArquivoSkw) {
        markAsChanged("NOMEARQUIVOSKW", nomeArquivoSkw);
   }

   public String getCaminhoArquivo() {
        return this.getVo().asString("CAMINHOARQUIVO");
   }

   public void setCaminhoArquivo(String caminhoArquivo) {
        markAsChanged("CAMINHOARQUIVO", caminhoArquivo);
   }

   public String getTipoDoc() {
        return this.getVo().asString("TIPODOC");
   }

   public void setTipoDoc(String tipoDoc) {
        markAsChanged("TIPODOC", tipoDoc);
   }

   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public Timestamp getDtAlter() {
        return this.getVo().asTimestamp("DTALTER");
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
   }

   @Override
   public String getTableName() {
        return "TCBAAECD";
   }

   @Override
   public String getEntityName() {
        return "ArquivoAnexoECD";
   }

   @Override
   public ArquivoAnexoECD fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
