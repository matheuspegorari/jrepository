package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ImportacaoExtratoBancario implements SankhyaEntity<ImportacaoExtratoBancario> {

   private BigDecimal codUsu;
   private Timestamp dhAlter;
   private Timestamp dhProcesso;
   private Timestamp dtImport;
   private String hashArquivo;
   private String nomeArq;
   private BigDecimal nuImport;
   private String processado;

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        this.codUsu = codUsu;
   }

   public Timestamp getDhAlter() {
        return dhAlter;
   }

   public void setDhAlter(Timestamp dhAlter) {
        this.dhAlter = dhAlter;
   }

   public Timestamp getDhProcesso() {
        return dhProcesso;
   }

   public void setDhProcesso(Timestamp dhProcesso) {
        this.dhProcesso = dhProcesso;
   }

   public Timestamp getDtImport() {
        return dtImport;
   }

   public void setDtImport(Timestamp dtImport) {
        this.dtImport = dtImport;
   }

   public String getHashArquivo() {
        return hashArquivo;
   }

   public void setHashArquivo(String hashArquivo) {
        this.hashArquivo = hashArquivo;
   }

   public String getNomeArq() {
        return nomeArq;
   }

   public void setNomeArq(String nomeArq) {
        this.nomeArq = nomeArq;
   }

   public BigDecimal getNuImport() {
        return nuImport;
   }

   public void setNuImport(BigDecimal nuImport) {
        this.nuImport = nuImport;
   }

   public String getProcessado() {
        return processado;
   }

   public void setProcessado(String processado) {
        this.processado = processado;
   }

   @Override
   public String getEntityName() {
        return "ImportacaoExtratoBancario";
   }

   @Override
   public ImportacaoExtratoBancario fromVO(DynamicVO vo) {
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.dhAlter = vo.asTimestamp("DHALTER");
        this.dhProcesso = vo.asTimestamp("DHPROCESSO");
        this.dtImport = vo.asTimestamp("DTIMPORT");
        this.hashArquivo = vo.asString("HASHARQUIVO");
        this.nomeArq = vo.asString("NOMEARQ");
        this.nuImport = vo.asBigDecimal("NUIMPORT");
        this.processado = vo.asString("PROCESSADO");
        return this;
   }
}
