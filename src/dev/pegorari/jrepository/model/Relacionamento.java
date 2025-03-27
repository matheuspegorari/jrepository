package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class Relacionamento extends AbstractSankhyaEntity<Relacionamento> {
   public BigDecimal getCodAtendente() {
        return this.getVo().asBigDecimal("CODATENDENTE");
   }

   public void setCodAtendente(BigDecimal codAtendente) {
        markAsChanged("CODATENDENTE", codAtendente);
   }

   public BigDecimal getCodContato() {
        return this.getVo().asBigDecimal("CODCONTATO");
   }

   public void setCodContato(BigDecimal codContato) {
        markAsChanged("CODCONTATO", codContato);
   }

   public BigDecimal getCodHist() {
        return this.getVo().asBigDecimal("CODHIST");
   }

   public void setCodHist(BigDecimal codHist) {
        markAsChanged("CODHIST", codHist);
   }

   public BigDecimal getCodParc() {
        return this.getVo().asBigDecimal("CODPARC");
   }

   public void setCodParc(BigDecimal codParc) {
        markAsChanged("CODPARC", codParc);
   }

   public BigDecimal getCodProd() {
        return this.getVo().asBigDecimal("CODPROD");
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public BigDecimal getCodVend() {
        return this.getVo().asBigDecimal("CODVEND");
   }

   public void setCodVend(BigDecimal codVend) {
        markAsChanged("CODVEND", codVend);
   }

   public String getComentarios() {
        return this.getVo().asString("COMENTARIOS");
   }

   public void setComentarios(String comentarios) {
        markAsChanged("COMENTARIOS", comentarios);
   }

   public String getComentarios2() {
        return this.getVo().asString("COMENTARIOS2");
   }

   public void setComentarios2(String comentarios2) {
        markAsChanged("COMENTARIOS2", comentarios2);
   }

   public Timestamp getDhChamada() {
        return this.getVo().asTimestamp("DHCHAMADA");
   }

   public void setDhChamada(Timestamp dhChamada) {
        markAsChanged("DHCHAMADA", dhChamada);
   }

   public Timestamp getDhProxCham() {
        return this.getVo().asTimestamp("DHPROXCHAM");
   }

   public void setDhProxCham(Timestamp dhProxCham) {
        markAsChanged("DHPROXCHAM", dhProxCham);
   }

   public Timestamp getDtAlter() {
        return this.getVo().asTimestamp("DTALTER");
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
   }

   public BigDecimal getNumOs() {
        return this.getVo().asBigDecimal("NUMOS");
   }

   public void setNumOs(BigDecimal numOs) {
        markAsChanged("NUMOS", numOs);
   }

   public BigDecimal getNuRel() {
        return this.getVo().asBigDecimal("NUREL");
   }

   public void setNuRel(BigDecimal nuRel) {
        markAsChanged("NUREL", nuRel);
   }

   public String getPendente() {
        return this.getVo().asString("PENDENTE");
   }

   public void setPendente(String pendente) {
        markAsChanged("PENDENTE", pendente);
   }

   public String getSituacao() {
        return this.getVo().asString("SITUACAO");
   }

   public void setSituacao(String situacao) {
        markAsChanged("SITUACAO", situacao);
   }

   public String getTelefoneParc() {
        return this.getVo().asString("TELEFONEPARC");
   }

   public void setTelefoneParc(String telefoneParc) {
        markAsChanged("TELEFONEPARC", telefoneParc);
   }

   public Timestamp getTempPrevisto() {
        return this.getVo().asTimestamp("TEMPPREVISTO");
   }

   public void setTempPrevisto(Timestamp tempPrevisto) {
        markAsChanged("TEMPPREVISTO", tempPrevisto);
   }

   public String getTipCham() {
        return this.getVo().asString("TIPCHAM");
   }

   public void setTipCham(String tipCham) {
        markAsChanged("TIPCHAM", tipCham);
   }

   public BigDecimal getNuAviso() {
        return this.getVo().asBigDecimal("NUAVISO");
   }

   public void setNuAviso(BigDecimal nuAviso) {
        markAsChanged("NUAVISO", nuAviso);
   }

   @Override
   public String getTableName() {
        return "TGFTEL";
   }

   @Override
   public String getEntityName() {
        return "Relacionamento";
   }

   @Override
   public Relacionamento fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
