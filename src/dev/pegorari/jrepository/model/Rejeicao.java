package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class Rejeicao extends AbstractSankhyaEntity<Rejeicao> {
   private BigDecimal codigo;
   private String codOcorrencia;
   private String codRej;
   private String descrRej;
   private BigDecimal sequencia;

   public BigDecimal getCodigo() {
        return codigo;
   }

   public void setCodigo(BigDecimal codigo) {
        this.codigo = codigo;
   }

   public String getCodOcorrencia() {
        return codOcorrencia;
   }

   public void setCodOcorrencia(String codOcorrencia) {
        this.codOcorrencia = codOcorrencia;
   }

   public String getCodRej() {
        return codRej;
   }

   public void setCodRej(String codRej) {
        this.codRej = codRej;
   }

   public String getDescrRej() {
        return descrRej;
   }

   public void setDescrRej(String descrRej) {
        this.descrRej = descrRej;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        this.sequencia = sequencia;
   }

   @Override
   public String getTableName() {
        return "TGFREJ";
   }

   @Override
   public String getEntityName() {
        return "Rejeicao";
   }

   @Override
   public Rejeicao fromVO(DynamicVO vo) {
        this.codigo = vo.asBigDecimal("CODIGO");
        this.codOcorrencia = vo.asString("CODOCORRENCIA");
        this.codRej = vo.asString("CODREJ");
        this.descrRej = vo.asString("DESCRREJ");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        return this;
   }
}
