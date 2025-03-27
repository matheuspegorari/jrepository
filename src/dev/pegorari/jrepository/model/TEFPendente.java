package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class TEFPendente extends AbstractSankhyaEntity<TEFPendente> {
   public String getAutorizacao() {
        return this.getVo().asString("AUTORIZACAO");
   }

   public void setAutorizacao(String autorizacao) {
        markAsChanged("AUTORIZACAO", autorizacao);
   }

   public String getBandeira() {
        return this.getVo().asString("BANDEIRA");
   }

   public void setBandeira(String bandeira) {
        markAsChanged("BANDEIRA", bandeira);
   }

   public String getCartao() {
        return this.getVo().asString("CARTAO");
   }

   public void setCartao(String cartao) {
        markAsChanged("CARTAO", cartao);
   }

   public String getChave() {
        return this.getVo().asString("CHAVE");
   }

   public void setChave(String chave) {
        markAsChanged("CHAVE", chave);
   }

   public String getCodControle() {
        return this.getVo().asString("CODCONTROLE");
   }

   public void setCodControle(String codControle) {
        markAsChanged("CODCONTROLE", codControle);
   }

   public BigDecimal getCodTiptit() {
        return this.getVo().asBigDecimal("CODTIPTIT");
   }

   public void setCodTiptit(BigDecimal codTiptit) {
        markAsChanged("CODTIPTIT", codTiptit);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public Timestamp getDhTransacao() {
        return this.getVo().asTimestamp("DHTRANSACAO");
   }

   public void setDhTransacao(Timestamp dhTransacao) {
        markAsChanged("DHTRANSACAO", dhTransacao);
   }

   public String getGateway() {
        return this.getVo().asString("GATEWAY");
   }

   public void setGateway(String gateway) {
        markAsChanged("GATEWAY", gateway);
   }

   public String getHostname() {
        return this.getVo().asString("HOSTNAME");
   }

   public void setHostname(String hostname) {
        markAsChanged("HOSTNAME", hostname);
   }

   public String getNomeRede() {
        return this.getVo().asString("NOMEREDE");
   }

   public void setNomeRede(String nomeRede) {
        markAsChanged("NOMEREDE", nomeRede);
   }

   public String getNumNsu() {
        return this.getVo().asString("NUMNSU");
   }

   public void setNumNsu(String numNsu) {
        markAsChanged("NUMNSU", numNsu);
   }

   public String getOperacao() {
        return this.getVo().asString("OPERACAO");
   }

   public void setOperacao(String operacao) {
        markAsChanged("OPERACAO", operacao);
   }

   public BigDecimal getQtdParcelas() {
        return this.getVo().asBigDecimal("QTDPARCELAS");
   }

   public void setQtdParcelas(BigDecimal qtdParcelas) {
        markAsChanged("QTDPARCELAS", qtdParcelas);
   }

   public char[] getRetorno() {
        return this.getVo().asClob("RETORNO");
   }

   public void setRetorno(char[] retorno) {
        markAsChanged("RETORNO", retorno);
   }

   public String getStatus() {
        return this.getVo().asString("STATUS");
   }

   public void setStatus(String status) {
        markAsChanged("STATUS", status);
   }

   public BigDecimal getVlrTransacao() {
        return this.getVo().asBigDecimal("VLRTRANSACAO");
   }

   public void setVlrTransacao(BigDecimal vlrTransacao) {
        markAsChanged("VLRTRANSACAO", vlrTransacao);
   }

   @Override
   public String getTableName() {
        return "TGFTSP";
   }

   @Override
   public String getEntityName() {
        return "TEFPendente";
   }

   @Override
   public TEFPendente fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
