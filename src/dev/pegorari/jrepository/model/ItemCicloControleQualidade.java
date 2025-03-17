package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ItemCicloControleQualidade extends AbstractSankhyaEntity<ItemCicloControleQualidade> {
   private String idSubfluxo;
   private String resultado;
   private BigDecimal idCcq;
   private String statusCiclo;
   private Timestamp dhInicio;
   private Timestamp dhFinal;
   private BigDecimal idIproc;
   private BigDecimal idIccq;

   public String getIdSubfluxo() {
        return idSubfluxo;
   }

   public void setIdSubfluxo(String idSubfluxo) {
        this.idSubfluxo = idSubfluxo;
   }

   public String getResultado() {
        return resultado;
   }

   public void setResultado(String resultado) {
        this.resultado = resultado;
   }

   public BigDecimal getIdCcq() {
        return idCcq;
   }

   public void setIdCcq(BigDecimal idCcq) {
        this.idCcq = idCcq;
   }

   public String getStatusCiclo() {
        return statusCiclo;
   }

   public void setStatusCiclo(String statusCiclo) {
        this.statusCiclo = statusCiclo;
   }

   public Timestamp getDhInicio() {
        return dhInicio;
   }

   public void setDhInicio(Timestamp dhInicio) {
        this.dhInicio = dhInicio;
   }

   public Timestamp getDhFinal() {
        return dhFinal;
   }

   public void setDhFinal(Timestamp dhFinal) {
        this.dhFinal = dhFinal;
   }

   public BigDecimal getIdIproc() {
        return idIproc;
   }

   public void setIdIproc(BigDecimal idIproc) {
        this.idIproc = idIproc;
   }

   public BigDecimal getIdIccq() {
        return idIccq;
   }

   public void setIdIccq(BigDecimal idIccq) {
        this.idIccq = idIccq;
   }

   @Override
   public String getTableName() {
        return "TPRICCQ";
   }

   @Override
   public String getEntityName() {
        return "ItemCicloControleQualidade";
   }

   @Override
   public ItemCicloControleQualidade fromVO(DynamicVO vo) {
        this.idSubfluxo = vo.asString("IDSUBFLUXO");
        this.resultado = vo.asString("RESULTADO");
        this.idCcq = vo.asBigDecimal("IDCCQ");
        this.statusCiclo = vo.asString("STATUSCICLO");
        this.dhInicio = vo.asTimestamp("DHINICIO");
        this.dhFinal = vo.asTimestamp("DHFINAL");
        this.idIproc = vo.asBigDecimal("IDIPROC");
        this.idIccq = vo.asBigDecimal("IDICCQ");
        return this;
   }
}
