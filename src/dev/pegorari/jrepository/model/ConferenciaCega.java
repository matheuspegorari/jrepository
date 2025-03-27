package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ConferenciaCega extends AbstractSankhyaEntity<ConferenciaCega> {
   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public String getDestFinal() {
        return this.getVo().asString("DESTFINAL");
   }

   public void setDestFinal(String destFinal) {
        markAsChanged("DESTFINAL", destFinal);
   }

   public Timestamp getDhFinalConf() {
        return this.getVo().asTimestamp("DHFINALCONF");
   }

   public void setDhFinalConf(Timestamp dhFinalConf) {
        markAsChanged("DHFINALCONF", dhFinalConf);
   }

   public Timestamp getDhInicioConf() {
        return this.getVo().asTimestamp("DHINICIOCONF");
   }

   public void setDhInicioConf(Timestamp dhInicioConf) {
        markAsChanged("DHINICIOCONF", dhInicioConf);
   }

   public BigDecimal getNuConferencia() {
        return this.getVo().asBigDecimal("NUCONFERENCIA");
   }

   public void setNuConferencia(BigDecimal nuConferencia) {
        markAsChanged("NUCONFERENCIA", nuConferencia);
   }

   public BigDecimal getNuRecebimento() {
        return this.getVo().asBigDecimal("NURECEBIMENTO");
   }

   public void setNuRecebimento(BigDecimal nuRecebimento) {
        markAsChanged("NURECEBIMENTO", nuRecebimento);
   }

   public String getParcial() {
        return this.getVo().asString("PARCIAL");
   }

   public void setParcial(String parcial) {
        markAsChanged("PARCIAL", parcial);
   }

   public String getSituacao() {
        return this.getVo().asString("SITUACAO");
   }

   public void setSituacao(String situacao) {
        markAsChanged("SITUACAO", situacao);
   }

   public String getTipConf() {
        return this.getVo().asString("TIPCONF");
   }

   public void setTipConf(String tipConf) {
        markAsChanged("TIPCONF", tipConf);
   }

   @Override
   public String getTableName() {
        return "TGWCON";
   }

   @Override
   public String getEntityName() {
        return "ConferenciaCega";
   }

   @Override
   public ConferenciaCega fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
