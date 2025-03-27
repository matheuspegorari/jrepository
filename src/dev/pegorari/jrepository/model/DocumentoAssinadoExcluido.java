package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class DocumentoAssinadoExcluido extends AbstractSankhyaEntity<DocumentoAssinadoExcluido> {
   public String getChaveArquivo() {
        return this.getVo().asString("CHAVEARQUIVO");
   }

   public void setChaveArquivo(String chaveArquivo) {
        markAsChanged("CHAVEARQUIVO", chaveArquivo);
   }

   public BigDecimal getNuDoc() {
        return this.getVo().asBigDecimal("NUDOC");
   }

   public void setNuDoc(BigDecimal nuDoc) {
        markAsChanged("NUDOC", nuDoc);
   }

   public String getMotivoExc() {
        return this.getVo().asString("MOTIVOEXC");
   }

   public void setMotivoExc(String motivoExc) {
        markAsChanged("MOTIVOEXC", motivoExc);
   }

   public BigDecimal getCodUsuExc() {
        return this.getVo().asBigDecimal("CODUSUEXC");
   }

   public void setCodUsuExc(BigDecimal codUsuExc) {
        markAsChanged("CODUSUEXC", codUsuExc);
   }

   public Timestamp getDhExc() {
        return this.getVo().asTimestamp("DHEXC");
   }

   public void setDhExc(Timestamp dhExc) {
        markAsChanged("DHEXC", dhExc);
   }

   @Override
   public String getTableName() {
        return "TSIDAS_EXC";
   }

   @Override
   public String getEntityName() {
        return "DocumentoAssinadoExcluido";
   }

   @Override
   public DocumentoAssinadoExcluido fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
