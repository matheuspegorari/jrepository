package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class TipoNegociacao extends AbstractSankhyaEntity<TipoNegociacao> {
   private String apresTransp;
   private String ativo;
   private String baixa;
   private BigDecimal basePrazo;
   private BigDecimal codCtaCtb1;
   private BigDecimal codCtaCtb2;
   private BigDecimal codFormDescMax;
   private BigDecimal codFormDescMaxItens;
   private BigDecimal codObsPadrao;
   private BigDecimal codTab;
   private BigDecimal codTcf;
   private BigDecimal codTipVenda;
   private BigDecimal codUsu;
   private BigDecimal comissao;
   private BigDecimal compraMax;
   private BigDecimal descMax;
   private String descProm;
   private String descTipVenda;
   private Timestamp dhAlter;
   private String editaSimulacao;
   private String emiteBoleta;
   private String emiteDupl;
   private String fixaVenc;
   private String flex;
   private String grupoAutor;
   private BigDecimal lucroMin;
   private BigDecimal margemMin;
   private String modeloPgto;
   private BigDecimal nroParcelas;
   private BigDecimal nuNota;
   private BigDecimal percMinEntrada;
   private String podeConsumidor;
   private String possuiSimSalva;
   private BigDecimal prazoMax;
   private BigDecimal prazoMaxPriParc;
   private BigDecimal prazoMedMax;
   private BigDecimal prazoMin;
   private String somaPrazoCliente;
   private String subTipoVenda;
   private BigDecimal taxaJuro;
   private BigDecimal taxaJurSim;
   private String tipJuro;
   private String tipoJurSim;
   private String tipTaxa;
   private BigDecimal txParcAdm;
   private String valPrazoCliente;
   private BigDecimal vendaMax;
   private BigDecimal vendaMin;
   private String arredPrimeiraParc;
   private BigDecimal timQtdParc;
   private String truncParcela;
   private String fastUsa;
   private String vencPrefixPed;
   private String integraEconect;
   private BigDecimal formaRecBtoSocin;
   private String exVendaMais;

   public String getApresTransp() {
        return apresTransp;
   }

   public void setApresTransp(String apresTransp) {
        markAsChanged("APRESTRANSP", apresTransp);
        this.apresTransp = apresTransp;
   }

   public String getAtivo() {
        return ativo;
   }

   public void setAtivo(String ativo) {
        markAsChanged("ATIVO", ativo);
        this.ativo = ativo;
   }

   public String getBaixa() {
        return baixa;
   }

   public void setBaixa(String baixa) {
        markAsChanged("BAIXA", baixa);
        this.baixa = baixa;
   }

   public BigDecimal getBasePrazo() {
        return basePrazo;
   }

   public void setBasePrazo(BigDecimal basePrazo) {
        markAsChanged("BASEPRAZO", basePrazo);
        this.basePrazo = basePrazo;
   }

   public BigDecimal getCodCtaCtb1() {
        return codCtaCtb1;
   }

   public void setCodCtaCtb1(BigDecimal codCtaCtb1) {
        markAsChanged("CODCTACTB_1", codCtaCtb1);
        this.codCtaCtb1 = codCtaCtb1;
   }

   public BigDecimal getCodCtaCtb2() {
        return codCtaCtb2;
   }

   public void setCodCtaCtb2(BigDecimal codCtaCtb2) {
        markAsChanged("CODCTACTB_2", codCtaCtb2);
        this.codCtaCtb2 = codCtaCtb2;
   }

   public BigDecimal getCodFormDescMax() {
        return codFormDescMax;
   }

   public void setCodFormDescMax(BigDecimal codFormDescMax) {
        markAsChanged("CODFORMDESCMAX", codFormDescMax);
        this.codFormDescMax = codFormDescMax;
   }

   public BigDecimal getCodFormDescMaxItens() {
        return codFormDescMaxItens;
   }

   public void setCodFormDescMaxItens(BigDecimal codFormDescMaxItens) {
        markAsChanged("CODFORMDESCMAXITENS", codFormDescMaxItens);
        this.codFormDescMaxItens = codFormDescMaxItens;
   }

   public BigDecimal getCodObsPadrao() {
        return codObsPadrao;
   }

   public void setCodObsPadrao(BigDecimal codObsPadrao) {
        markAsChanged("CODOBSPADRAO", codObsPadrao);
        this.codObsPadrao = codObsPadrao;
   }

   public BigDecimal getCodTab() {
        return codTab;
   }

   public void setCodTab(BigDecimal codTab) {
        markAsChanged("CODTAB", codTab);
        this.codTab = codTab;
   }

   public BigDecimal getCodTcf() {
        return codTcf;
   }

   public void setCodTcf(BigDecimal codTcf) {
        markAsChanged("CODTCF", codTcf);
        this.codTcf = codTcf;
   }

   public BigDecimal getCodTipVenda() {
        return codTipVenda;
   }

   public void setCodTipVenda(BigDecimal codTipVenda) {
        markAsChanged("CODTIPVENDA", codTipVenda);
        this.codTipVenda = codTipVenda;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
   }

   public BigDecimal getComissao() {
        return comissao;
   }

   public void setComissao(BigDecimal comissao) {
        markAsChanged("COMISSAO", comissao);
        this.comissao = comissao;
   }

   public BigDecimal getCompraMax() {
        return compraMax;
   }

   public void setCompraMax(BigDecimal compraMax) {
        markAsChanged("COMPRAMAX", compraMax);
        this.compraMax = compraMax;
   }

   public BigDecimal getDescMax() {
        return descMax;
   }

   public void setDescMax(BigDecimal descMax) {
        markAsChanged("DESCMAX", descMax);
        this.descMax = descMax;
   }

   public String getDescProm() {
        return descProm;
   }

   public void setDescProm(String descProm) {
        markAsChanged("DESCPROM", descProm);
        this.descProm = descProm;
   }

   public String getDescTipVenda() {
        return descTipVenda;
   }

   public void setDescTipVenda(String descTipVenda) {
        markAsChanged("DESCRTIPVENDA", descTipVenda);
        this.descTipVenda = descTipVenda;
   }

   public Timestamp getDhAlter() {
        return dhAlter;
   }

   public void setDhAlter(Timestamp dhAlter) {
        markAsChanged("DHALTER", dhAlter);
        this.dhAlter = dhAlter;
   }

   public String getEditaSimulacao() {
        return editaSimulacao;
   }

   public void setEditaSimulacao(String editaSimulacao) {
        markAsChanged("EDITASIMULACAO", editaSimulacao);
        this.editaSimulacao = editaSimulacao;
   }

   public String getEmiteBoleta() {
        return emiteBoleta;
   }

   public void setEmiteBoleta(String emiteBoleta) {
        markAsChanged("EMITEBOLETA", emiteBoleta);
        this.emiteBoleta = emiteBoleta;
   }

   public String getEmiteDupl() {
        return emiteDupl;
   }

   public void setEmiteDupl(String emiteDupl) {
        markAsChanged("EMITEDUPL", emiteDupl);
        this.emiteDupl = emiteDupl;
   }

   public String getFixaVenc() {
        return fixaVenc;
   }

   public void setFixaVenc(String fixaVenc) {
        markAsChanged("FIXAVENC", fixaVenc);
        this.fixaVenc = fixaVenc;
   }

   public String getFlex() {
        return flex;
   }

   public void setFlex(String flex) {
        markAsChanged("FLEX", flex);
        this.flex = flex;
   }

   public String getGrupoAutor() {
        return grupoAutor;
   }

   public void setGrupoAutor(String grupoAutor) {
        markAsChanged("GRUPOAUTOR", grupoAutor);
        this.grupoAutor = grupoAutor;
   }

   public BigDecimal getLucroMin() {
        return lucroMin;
   }

   public void setLucroMin(BigDecimal lucroMin) {
        markAsChanged("LUCROMIN", lucroMin);
        this.lucroMin = lucroMin;
   }

   public BigDecimal getMargemMin() {
        return margemMin;
   }

   public void setMargemMin(BigDecimal margemMin) {
        markAsChanged("MARGEMMIN", margemMin);
        this.margemMin = margemMin;
   }

   public String getModeloPgto() {
        return modeloPgto;
   }

   public void setModeloPgto(String modeloPgto) {
        markAsChanged("MODELOPGTO", modeloPgto);
        this.modeloPgto = modeloPgto;
   }

   public BigDecimal getNroParcelas() {
        return nroParcelas;
   }

   public void setNroParcelas(BigDecimal nroParcelas) {
        markAsChanged("NROPARCELAS", nroParcelas);
        this.nroParcelas = nroParcelas;
   }

   public BigDecimal getNuNota() {
        return nuNota;
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
        this.nuNota = nuNota;
   }

   public BigDecimal getPercMinEntrada() {
        return percMinEntrada;
   }

   public void setPercMinEntrada(BigDecimal percMinEntrada) {
        markAsChanged("PERCMINENTRADA", percMinEntrada);
        this.percMinEntrada = percMinEntrada;
   }

   public String getPodeConsumidor() {
        return podeConsumidor;
   }

   public void setPodeConsumidor(String podeConsumidor) {
        markAsChanged("PODECONSUMIDOR", podeConsumidor);
        this.podeConsumidor = podeConsumidor;
   }

   public String getPossuiSimSalva() {
        return possuiSimSalva;
   }

   public void setPossuiSimSalva(String possuiSimSalva) {
        markAsChanged("POSSUISIMSALVA", possuiSimSalva);
        this.possuiSimSalva = possuiSimSalva;
   }

   public BigDecimal getPrazoMax() {
        return prazoMax;
   }

   public void setPrazoMax(BigDecimal prazoMax) {
        markAsChanged("PRAZOMAX", prazoMax);
        this.prazoMax = prazoMax;
   }

   public BigDecimal getPrazoMaxPriParc() {
        return prazoMaxPriParc;
   }

   public void setPrazoMaxPriParc(BigDecimal prazoMaxPriParc) {
        markAsChanged("PRAZOMAXPRIPARC", prazoMaxPriParc);
        this.prazoMaxPriParc = prazoMaxPriParc;
   }

   public BigDecimal getPrazoMedMax() {
        return prazoMedMax;
   }

   public void setPrazoMedMax(BigDecimal prazoMedMax) {
        markAsChanged("PRAZOMEDMAX", prazoMedMax);
        this.prazoMedMax = prazoMedMax;
   }

   public BigDecimal getPrazoMin() {
        return prazoMin;
   }

   public void setPrazoMin(BigDecimal prazoMin) {
        markAsChanged("PRAZOMIN", prazoMin);
        this.prazoMin = prazoMin;
   }

   public String getSomaPrazoCliente() {
        return somaPrazoCliente;
   }

   public void setSomaPrazoCliente(String somaPrazoCliente) {
        markAsChanged("SOMAPRAZOCLIENTE", somaPrazoCliente);
        this.somaPrazoCliente = somaPrazoCliente;
   }

   public String getSubTipoVenda() {
        return subTipoVenda;
   }

   public void setSubTipoVenda(String subTipoVenda) {
        markAsChanged("SUBTIPOVENDA", subTipoVenda);
        this.subTipoVenda = subTipoVenda;
   }

   public BigDecimal getTaxaJuro() {
        return taxaJuro;
   }

   public void setTaxaJuro(BigDecimal taxaJuro) {
        markAsChanged("TAXAJURO", taxaJuro);
        this.taxaJuro = taxaJuro;
   }

   public BigDecimal getTaxaJurSim() {
        return taxaJurSim;
   }

   public void setTaxaJurSim(BigDecimal taxaJurSim) {
        markAsChanged("TAXAJURSIM", taxaJurSim);
        this.taxaJurSim = taxaJurSim;
   }

   public String getTipJuro() {
        return tipJuro;
   }

   public void setTipJuro(String tipJuro) {
        markAsChanged("TIPJURO", tipJuro);
        this.tipJuro = tipJuro;
   }

   public String getTipoJurSim() {
        return tipoJurSim;
   }

   public void setTipoJurSim(String tipoJurSim) {
        markAsChanged("TIPOJURSIM", tipoJurSim);
        this.tipoJurSim = tipoJurSim;
   }

   public String getTipTaxa() {
        return tipTaxa;
   }

   public void setTipTaxa(String tipTaxa) {
        markAsChanged("TIPTAXA", tipTaxa);
        this.tipTaxa = tipTaxa;
   }

   public BigDecimal getTxParcAdm() {
        return txParcAdm;
   }

   public void setTxParcAdm(BigDecimal txParcAdm) {
        markAsChanged("TXPARCADM", txParcAdm);
        this.txParcAdm = txParcAdm;
   }

   public String getValPrazoCliente() {
        return valPrazoCliente;
   }

   public void setValPrazoCliente(String valPrazoCliente) {
        markAsChanged("VALPRAZOCLIENTE", valPrazoCliente);
        this.valPrazoCliente = valPrazoCliente;
   }

   public BigDecimal getVendaMax() {
        return vendaMax;
   }

   public void setVendaMax(BigDecimal vendaMax) {
        markAsChanged("VENDAMAX", vendaMax);
        this.vendaMax = vendaMax;
   }

   public BigDecimal getVendaMin() {
        return vendaMin;
   }

   public void setVendaMin(BigDecimal vendaMin) {
        markAsChanged("VENDAMIN", vendaMin);
        this.vendaMin = vendaMin;
   }

   public String getArredPrimeiraParc() {
        return arredPrimeiraParc;
   }

   public void setArredPrimeiraParc(String arredPrimeiraParc) {
        markAsChanged("ARREDPRIMEIRAPARC", arredPrimeiraParc);
        this.arredPrimeiraParc = arredPrimeiraParc;
   }

   public BigDecimal getTimQtdParc() {
        return timQtdParc;
   }

   public void setTimQtdParc(BigDecimal timQtdParc) {
        markAsChanged("TIMQTDPARC", timQtdParc);
        this.timQtdParc = timQtdParc;
   }

   public String getTruncParcela() {
        return truncParcela;
   }

   public void setTruncParcela(String truncParcela) {
        markAsChanged("TRUNCPARCELA", truncParcela);
        this.truncParcela = truncParcela;
   }

   public String getFastUsa() {
        return fastUsa;
   }

   public void setFastUsa(String fastUsa) {
        markAsChanged("FASTUSA", fastUsa);
        this.fastUsa = fastUsa;
   }

   public String getVencPrefixPed() {
        return vencPrefixPed;
   }

   public void setVencPrefixPed(String vencPrefixPed) {
        markAsChanged("VENCPREFIXPED", vencPrefixPed);
        this.vencPrefixPed = vencPrefixPed;
   }

   public String getIntegraEconect() {
        return integraEconect;
   }

   public void setIntegraEconect(String integraEconect) {
        markAsChanged("INTEGRAECONECT", integraEconect);
        this.integraEconect = integraEconect;
   }

   public BigDecimal getFormaRecBtoSocin() {
        return formaRecBtoSocin;
   }

   public void setFormaRecBtoSocin(BigDecimal formaRecBtoSocin) {
        markAsChanged("FORMARECBTOSOCIN", formaRecBtoSocin);
        this.formaRecBtoSocin = formaRecBtoSocin;
   }

   public String getExVendaMais() {
        return exVendaMais;
   }

   public void setExVendaMais(String exVendaMais) {
        markAsChanged("EXVENDAMAIS", exVendaMais);
        this.exVendaMais = exVendaMais;
   }

   @Override
   public String getTableName() {
        return "TGFTPV";
   }

   @Override
   public String getEntityName() {
        return "TipoNegociacao";
   }

   @Override
   public TipoNegociacao fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.apresTransp = vo.asString("APRESTRANSP");
        this.ativo = vo.asString("ATIVO");
        this.baixa = vo.asString("BAIXA");
        this.basePrazo = vo.asBigDecimal("BASEPRAZO");
        this.codCtaCtb1 = vo.asBigDecimal("CODCTACTB_1");
        this.codCtaCtb2 = vo.asBigDecimal("CODCTACTB_2");
        this.codFormDescMax = vo.asBigDecimal("CODFORMDESCMAX");
        this.codFormDescMaxItens = vo.asBigDecimal("CODFORMDESCMAXITENS");
        this.codObsPadrao = vo.asBigDecimal("CODOBSPADRAO");
        this.codTab = vo.asBigDecimal("CODTAB");
        this.codTcf = vo.asBigDecimal("CODTCF");
        this.codTipVenda = vo.asBigDecimal("CODTIPVENDA");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.comissao = vo.asBigDecimal("COMISSAO");
        this.compraMax = vo.asBigDecimal("COMPRAMAX");
        this.descMax = vo.asBigDecimal("DESCMAX");
        this.descProm = vo.asString("DESCPROM");
        this.descTipVenda = vo.asString("DESCRTIPVENDA");
        this.dhAlter = vo.asTimestamp("DHALTER");
        this.editaSimulacao = vo.asString("EDITASIMULACAO");
        this.emiteBoleta = vo.asString("EMITEBOLETA");
        this.emiteDupl = vo.asString("EMITEDUPL");
        this.fixaVenc = vo.asString("FIXAVENC");
        this.flex = vo.asString("FLEX");
        this.grupoAutor = vo.asString("GRUPOAUTOR");
        this.lucroMin = vo.asBigDecimal("LUCROMIN");
        this.margemMin = vo.asBigDecimal("MARGEMMIN");
        this.modeloPgto = vo.asString("MODELOPGTO");
        this.nroParcelas = vo.asBigDecimal("NROPARCELAS");
        this.nuNota = vo.asBigDecimal("NUNOTA");
        this.percMinEntrada = vo.asBigDecimal("PERCMINENTRADA");
        this.podeConsumidor = vo.asString("PODECONSUMIDOR");
        this.possuiSimSalva = vo.asString("POSSUISIMSALVA");
        this.prazoMax = vo.asBigDecimal("PRAZOMAX");
        this.prazoMaxPriParc = vo.asBigDecimal("PRAZOMAXPRIPARC");
        this.prazoMedMax = vo.asBigDecimal("PRAZOMEDMAX");
        this.prazoMin = vo.asBigDecimal("PRAZOMIN");
        this.somaPrazoCliente = vo.asString("SOMAPRAZOCLIENTE");
        this.subTipoVenda = vo.asString("SUBTIPOVENDA");
        this.taxaJuro = vo.asBigDecimal("TAXAJURO");
        this.taxaJurSim = vo.asBigDecimal("TAXAJURSIM");
        this.tipJuro = vo.asString("TIPJURO");
        this.tipoJurSim = vo.asString("TIPOJURSIM");
        this.tipTaxa = vo.asString("TIPTAXA");
        this.txParcAdm = vo.asBigDecimal("TXPARCADM");
        this.valPrazoCliente = vo.asString("VALPRAZOCLIENTE");
        this.vendaMax = vo.asBigDecimal("VENDAMAX");
        this.vendaMin = vo.asBigDecimal("VENDAMIN");
        this.arredPrimeiraParc = vo.asString("ARREDPRIMEIRAPARC");
        this.timQtdParc = vo.asBigDecimal("TIMQTDPARC");
        this.truncParcela = vo.asString("TRUNCPARCELA");
        this.fastUsa = vo.asString("FASTUSA");
        this.vencPrefixPed = vo.asString("VENCPREFIXPED");
        this.integraEconect = vo.asString("INTEGRAECONECT");
        this.formaRecBtoSocin = vo.asBigDecimal("FORMARECBTOSOCIN");
        this.exVendaMais = vo.asString("EXVENDAMAIS");
        return this;
   }
}
