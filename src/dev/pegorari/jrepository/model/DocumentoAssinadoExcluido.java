package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class DocumentoAssinadoExcluido implements SankhyaEntity<DocumentoAssinadoExcluido> {

   private String chaveArquivo;
   private BigDecimal nuDoc;
   private String motivoExc;
   private BigDecimal codUsuExc;
   private Timestamp dhExc;

   public String getChaveArquivo() {
        return chaveArquivo;
   }

   public void setChaveArquivo(String chaveArquivo) {
        this.chaveArquivo = chaveArquivo;
   }

   public BigDecimal getNuDoc() {
        return nuDoc;
   }

   public void setNuDoc(BigDecimal nuDoc) {
        this.nuDoc = nuDoc;
   }

   public String getMotivoExc() {
        return motivoExc;
   }

   public void setMotivoExc(String motivoExc) {
        this.motivoExc = motivoExc;
   }

   public BigDecimal getCodUsuExc() {
        return codUsuExc;
   }

   public void setCodUsuExc(BigDecimal codUsuExc) {
        this.codUsuExc = codUsuExc;
   }

   public Timestamp getDhExc() {
        return dhExc;
   }

   public void setDhExc(Timestamp dhExc) {
        this.dhExc = dhExc;
   }

   @Override
   public String getEntityName() {
        return "DocumentoAssinadoExcluido";
   }

   @Override
   public DocumentoAssinadoExcluido fromVO(DynamicVO vo) {
        this.chaveArquivo = vo.asString("CHAVEARQUIVO");
        this.nuDoc = vo.asBigDecimal("NUDOC");
        this.motivoExc = vo.asString("MOTIVOEXC");
        this.codUsuExc = vo.asBigDecimal("CODUSUEXC");
        this.dhExc = vo.asTimestamp("DHEXC");
        return this;
   }
}
