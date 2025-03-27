package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ItemCicloControleQualidade extends AbstractSankhyaEntity<ItemCicloControleQualidade> {
   public String getIdSubfluxo() {
        return this.getVo().asString("IDSUBFLUXO");
   }

   public void setIdSubfluxo(String idSubfluxo) {
        markAsChanged("IDSUBFLUXO", idSubfluxo);
   }

   public String getResultado() {
        return this.getVo().asString("RESULTADO");
   }

   public void setResultado(String resultado) {
        markAsChanged("RESULTADO", resultado);
   }

   public BigDecimal getIdCcq() {
        return this.getVo().asBigDecimal("IDCCQ");
   }

   public void setIdCcq(BigDecimal idCcq) {
        markAsChanged("IDCCQ", idCcq);
   }

   public String getStatusCiclo() {
        return this.getVo().asString("STATUSCICLO");
   }

   public void setStatusCiclo(String statusCiclo) {
        markAsChanged("STATUSCICLO", statusCiclo);
   }

   public Timestamp getDhInicio() {
        return this.getVo().asTimestamp("DHINICIO");
   }

   public void setDhInicio(Timestamp dhInicio) {
        markAsChanged("DHINICIO", dhInicio);
   }

   public Timestamp getDhFinal() {
        return this.getVo().asTimestamp("DHFINAL");
   }

   public void setDhFinal(Timestamp dhFinal) {
        markAsChanged("DHFINAL", dhFinal);
   }

   public BigDecimal getIdIproc() {
        return this.getVo().asBigDecimal("IDIPROC");
   }

   public void setIdIproc(BigDecimal idIproc) {
        markAsChanged("IDIPROC", idIproc);
   }

   public BigDecimal getIdIccq() {
        return this.getVo().asBigDecimal("IDICCQ");
   }

   public void setIdIccq(BigDecimal idIccq) {
        markAsChanged("IDICCQ", idIccq);
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
        this.setVo(vo);
        return this;
   }
}
