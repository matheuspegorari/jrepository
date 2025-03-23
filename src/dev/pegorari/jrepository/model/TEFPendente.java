package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class TEFPendente extends AbstractSankhyaEntity<TEFPendente> {
   private String autorizacao;
   private String bandeira;
   private String cartao;
   private String chave;
   private String codControle;
   private BigDecimal codTiptit;
   private BigDecimal codUsu;
   private Timestamp dhTransacao;
   private String gateway;
   private String hostname;
   private String nomeRede;
   private String numNsu;
   private String operacao;
   private BigDecimal qtdParcelas;
   private char[] retorno;
   private String status;
   private BigDecimal vlrTransacao;

   public String getAutorizacao() {
        return autorizacao;
   }

   public void setAutorizacao(String autorizacao) {
        markAsChanged("AUTORIZACAO", autorizacao);
        this.autorizacao = autorizacao;
   }

   public String getBandeira() {
        return bandeira;
   }

   public void setBandeira(String bandeira) {
        markAsChanged("BANDEIRA", bandeira);
        this.bandeira = bandeira;
   }

   public String getCartao() {
        return cartao;
   }

   public void setCartao(String cartao) {
        markAsChanged("CARTAO", cartao);
        this.cartao = cartao;
   }

   public String getChave() {
        return chave;
   }

   public void setChave(String chave) {
        markAsChanged("CHAVE", chave);
        this.chave = chave;
   }

   public String getCodControle() {
        return codControle;
   }

   public void setCodControle(String codControle) {
        markAsChanged("CODCONTROLE", codControle);
        this.codControle = codControle;
   }

   public BigDecimal getCodTiptit() {
        return codTiptit;
   }

   public void setCodTiptit(BigDecimal codTiptit) {
        markAsChanged("CODTIPTIT", codTiptit);
        this.codTiptit = codTiptit;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
   }

   public Timestamp getDhTransacao() {
        return dhTransacao;
   }

   public void setDhTransacao(Timestamp dhTransacao) {
        markAsChanged("DHTRANSACAO", dhTransacao);
        this.dhTransacao = dhTransacao;
   }

   public String getGateway() {
        return gateway;
   }

   public void setGateway(String gateway) {
        markAsChanged("GATEWAY", gateway);
        this.gateway = gateway;
   }

   public String getHostname() {
        return hostname;
   }

   public void setHostname(String hostname) {
        markAsChanged("HOSTNAME", hostname);
        this.hostname = hostname;
   }

   public String getNomeRede() {
        return nomeRede;
   }

   public void setNomeRede(String nomeRede) {
        markAsChanged("NOMEREDE", nomeRede);
        this.nomeRede = nomeRede;
   }

   public String getNumNsu() {
        return numNsu;
   }

   public void setNumNsu(String numNsu) {
        markAsChanged("NUMNSU", numNsu);
        this.numNsu = numNsu;
   }

   public String getOperacao() {
        return operacao;
   }

   public void setOperacao(String operacao) {
        markAsChanged("OPERACAO", operacao);
        this.operacao = operacao;
   }

   public BigDecimal getQtdParcelas() {
        return qtdParcelas;
   }

   public void setQtdParcelas(BigDecimal qtdParcelas) {
        markAsChanged("QTDPARCELAS", qtdParcelas);
        this.qtdParcelas = qtdParcelas;
   }

   public char[] getRetorno() {
        return retorno;
   }

   public void setRetorno(char[] retorno) {
        markAsChanged("RETORNO", retorno);
        this.retorno = retorno;
   }

   public String getStatus() {
        return status;
   }

   public void setStatus(String status) {
        markAsChanged("STATUS", status);
        this.status = status;
   }

   public BigDecimal getVlrTransacao() {
        return vlrTransacao;
   }

   public void setVlrTransacao(BigDecimal vlrTransacao) {
        markAsChanged("VLRTRANSACAO", vlrTransacao);
        this.vlrTransacao = vlrTransacao;
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
        this.autorizacao = vo.asString("AUTORIZACAO");
        this.bandeira = vo.asString("BANDEIRA");
        this.cartao = vo.asString("CARTAO");
        this.chave = vo.asString("CHAVE");
        this.codControle = vo.asString("CODCONTROLE");
        this.codTiptit = vo.asBigDecimal("CODTIPTIT");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.dhTransacao = vo.asTimestamp("DHTRANSACAO");
        this.gateway = vo.asString("GATEWAY");
        this.hostname = vo.asString("HOSTNAME");
        this.nomeRede = vo.asString("NOMEREDE");
        this.numNsu = vo.asString("NUMNSU");
        this.operacao = vo.asString("OPERACAO");
        this.qtdParcelas = vo.asBigDecimal("QTDPARCELAS");
        this.retorno = vo.asClob("RETORNO");
        this.status = vo.asString("STATUS");
        this.vlrTransacao = vo.asBigDecimal("VLRTRANSACAO");
        return this;
   }
}
