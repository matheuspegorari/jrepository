package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class Imobilizado extends AbstractSankhyaEntity<Imobilizado> {
   private String descrLocal;
   private Timestamp dtBaixa;
   private Timestamp dtCompra;
   private Timestamp dtFimDep;
   private Timestamp dtFimRefCiap;
   private Timestamp dtInicioDep;
   private BigDecimal nuNota;
   private BigDecimal nuNotaBaixa;
   private BigDecimal valorPresente;
   private BigDecimal vlrDepOrig;
   private Timestamp dtRetorno;
   private BigDecimal nfDevVenda;
   private BigDecimal nfRetorno;
   private BigDecimal nfSaida;
   private String nomePossuidor;
   private BigDecimal numContrato;
   private BigDecimal numNota;
   private BigDecimal numNotaBaixa;
   private BigDecimal nuNotaDev;
   private BigDecimal nuNotaDevVenda;
   private BigDecimal nuNotaSaida;
   private BigDecimal qtdMesesCiap;
   private String temDepreciacao;
   private BigDecimal vlrAquisicao;
   private BigDecimal vlrDep;
   private BigDecimal vlrIcmsCiap;
   private BigDecimal vlrIcmsDifCiap;
   private BigDecimal vlrIcmsFrtCiap;
   private BigDecimal vlrIcmsStCiap;
   private BigDecimal vlrSaldo;
   private String codBem;
   private String codBemAtual;
   private String codBemOrig;
   private BigDecimal codDep;
   private BigDecimal codEmp;
   private Timestamp dtIniRefCiap;
   private BigDecimal codLocal;
   private BigDecimal codPossuidor;
   private BigDecimal codProd;
   private String descrAbrev;
   private String descrBem;
   private BigDecimal aliqCofins;
   private BigDecimal aliqPis;
   private BigDecimal cstCofins;
   private BigDecimal cstPis;
   private String descrUtilBem;
   private Timestamp dtFimAj;
   private Timestamp dtInicioAj;
   private BigDecimal nParcPisCof;
   private String pisCofMp540;
   private BigDecimal saldo;
   private String temAj;
   private String temCredPisCofinsDepr;
   private String tipoEntCiap;
   private BigDecimal utilImob;
   private BigDecimal vlrCompraAquisicao;
   private BigDecimal vlrDepAj;
   private BigDecimal vlrSaldoAj;
   private BigDecimal vlrTotDespesaBem;
   private BigDecimal vidaUtil;
   private BigDecimal codProdOrig;
   private BigDecimal codUsuDesmembramento;
   private Timestamp dhDesmembramento;
   private BigDecimal nuNotaOrigDesmemb;
   private BigDecimal vlrExcBaseCred;
   private BigDecimal codUsuCompra;
   private Timestamp dhAlterCompra;
   private String digitadoCompra;
   private BigDecimal vlrCofinsCompra;
   private BigDecimal vlrCompraAquisicaoCalc;
   private BigDecimal vlrIcmsCiapCalc;
   private BigDecimal vlrIcmsStCiapCalc;
   private BigDecimal vlrPisCompra;

   public String getDescrLocal() {
        return descrLocal;
   }

   public void setDescrLocal(String descrLocal) {
        markAsChanged("DESCRLOCAL", descrLocal);
        this.descrLocal = descrLocal;
   }

   public Timestamp getDtBaixa() {
        return dtBaixa;
   }

   public void setDtBaixa(Timestamp dtBaixa) {
        markAsChanged("DTBAIXA", dtBaixa);
        this.dtBaixa = dtBaixa;
   }

   public Timestamp getDtCompra() {
        return dtCompra;
   }

   public void setDtCompra(Timestamp dtCompra) {
        markAsChanged("DTCOMPRA", dtCompra);
        this.dtCompra = dtCompra;
   }

   public Timestamp getDtFimDep() {
        return dtFimDep;
   }

   public void setDtFimDep(Timestamp dtFimDep) {
        markAsChanged("DTFIMDEP", dtFimDep);
        this.dtFimDep = dtFimDep;
   }

   public Timestamp getDtFimRefCiap() {
        return dtFimRefCiap;
   }

   public void setDtFimRefCiap(Timestamp dtFimRefCiap) {
        markAsChanged("DTFIMREFCIAP", dtFimRefCiap);
        this.dtFimRefCiap = dtFimRefCiap;
   }

   public Timestamp getDtInicioDep() {
        return dtInicioDep;
   }

   public void setDtInicioDep(Timestamp dtInicioDep) {
        markAsChanged("DTINICIODEP", dtInicioDep);
        this.dtInicioDep = dtInicioDep;
   }

   public BigDecimal getNuNota() {
        return nuNota;
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
        this.nuNota = nuNota;
   }

   public BigDecimal getNuNotaBaixa() {
        return nuNotaBaixa;
   }

   public void setNuNotaBaixa(BigDecimal nuNotaBaixa) {
        markAsChanged("NUNOTABAIXA", nuNotaBaixa);
        this.nuNotaBaixa = nuNotaBaixa;
   }

   public BigDecimal getValorPresente() {
        return valorPresente;
   }

   public void setValorPresente(BigDecimal valorPresente) {
        markAsChanged("VALORPRESENTE", valorPresente);
        this.valorPresente = valorPresente;
   }

   public BigDecimal getVlrDepOrig() {
        return vlrDepOrig;
   }

   public void setVlrDepOrig(BigDecimal vlrDepOrig) {
        markAsChanged("VLRDEPORIG", vlrDepOrig);
        this.vlrDepOrig = vlrDepOrig;
   }

   public Timestamp getDtRetorno() {
        return dtRetorno;
   }

   public void setDtRetorno(Timestamp dtRetorno) {
        markAsChanged("DTRETORNO", dtRetorno);
        this.dtRetorno = dtRetorno;
   }

   public BigDecimal getNfDevVenda() {
        return nfDevVenda;
   }

   public void setNfDevVenda(BigDecimal nfDevVenda) {
        markAsChanged("NFDEVVENDA", nfDevVenda);
        this.nfDevVenda = nfDevVenda;
   }

   public BigDecimal getNfRetorno() {
        return nfRetorno;
   }

   public void setNfRetorno(BigDecimal nfRetorno) {
        markAsChanged("NFRETORNO", nfRetorno);
        this.nfRetorno = nfRetorno;
   }

   public BigDecimal getNfSaida() {
        return nfSaida;
   }

   public void setNfSaida(BigDecimal nfSaida) {
        markAsChanged("NFSAIDA", nfSaida);
        this.nfSaida = nfSaida;
   }

   public String getNomePossuidor() {
        return nomePossuidor;
   }

   public void setNomePossuidor(String nomePossuidor) {
        markAsChanged("NOMEPOSSUIDOR", nomePossuidor);
        this.nomePossuidor = nomePossuidor;
   }

   public BigDecimal getNumContrato() {
        return numContrato;
   }

   public void setNumContrato(BigDecimal numContrato) {
        markAsChanged("NUMCONTRATO", numContrato);
        this.numContrato = numContrato;
   }

   public BigDecimal getNumNota() {
        return numNota;
   }

   public void setNumNota(BigDecimal numNota) {
        markAsChanged("NUMNOTA", numNota);
        this.numNota = numNota;
   }

   public BigDecimal getNumNotaBaixa() {
        return numNotaBaixa;
   }

   public void setNumNotaBaixa(BigDecimal numNotaBaixa) {
        markAsChanged("NUMNOTABAIXA", numNotaBaixa);
        this.numNotaBaixa = numNotaBaixa;
   }

   public BigDecimal getNuNotaDev() {
        return nuNotaDev;
   }

   public void setNuNotaDev(BigDecimal nuNotaDev) {
        markAsChanged("NUNOTADEV", nuNotaDev);
        this.nuNotaDev = nuNotaDev;
   }

   public BigDecimal getNuNotaDevVenda() {
        return nuNotaDevVenda;
   }

   public void setNuNotaDevVenda(BigDecimal nuNotaDevVenda) {
        markAsChanged("NUNOTADEVVENDA", nuNotaDevVenda);
        this.nuNotaDevVenda = nuNotaDevVenda;
   }

   public BigDecimal getNuNotaSaida() {
        return nuNotaSaida;
   }

   public void setNuNotaSaida(BigDecimal nuNotaSaida) {
        markAsChanged("NUNOTASAIDA", nuNotaSaida);
        this.nuNotaSaida = nuNotaSaida;
   }

   public BigDecimal getQtdMesesCiap() {
        return qtdMesesCiap;
   }

   public void setQtdMesesCiap(BigDecimal qtdMesesCiap) {
        markAsChanged("QTDMESESCIAP", qtdMesesCiap);
        this.qtdMesesCiap = qtdMesesCiap;
   }

   public String getTemDepreciacao() {
        return temDepreciacao;
   }

   public void setTemDepreciacao(String temDepreciacao) {
        markAsChanged("TEMDEPRECIACAO", temDepreciacao);
        this.temDepreciacao = temDepreciacao;
   }

   public BigDecimal getVlrAquisicao() {
        return vlrAquisicao;
   }

   public void setVlrAquisicao(BigDecimal vlrAquisicao) {
        markAsChanged("VLRAQUISICAO", vlrAquisicao);
        this.vlrAquisicao = vlrAquisicao;
   }

   public BigDecimal getVlrDep() {
        return vlrDep;
   }

   public void setVlrDep(BigDecimal vlrDep) {
        markAsChanged("VLRDEP", vlrDep);
        this.vlrDep = vlrDep;
   }

   public BigDecimal getVlrIcmsCiap() {
        return vlrIcmsCiap;
   }

   public void setVlrIcmsCiap(BigDecimal vlrIcmsCiap) {
        markAsChanged("VLRICMSCIAP", vlrIcmsCiap);
        this.vlrIcmsCiap = vlrIcmsCiap;
   }

   public BigDecimal getVlrIcmsDifCiap() {
        return vlrIcmsDifCiap;
   }

   public void setVlrIcmsDifCiap(BigDecimal vlrIcmsDifCiap) {
        markAsChanged("VLRICMSDIFCIAP", vlrIcmsDifCiap);
        this.vlrIcmsDifCiap = vlrIcmsDifCiap;
   }

   public BigDecimal getVlrIcmsFrtCiap() {
        return vlrIcmsFrtCiap;
   }

   public void setVlrIcmsFrtCiap(BigDecimal vlrIcmsFrtCiap) {
        markAsChanged("VLRICMSFRTCIAP", vlrIcmsFrtCiap);
        this.vlrIcmsFrtCiap = vlrIcmsFrtCiap;
   }

   public BigDecimal getVlrIcmsStCiap() {
        return vlrIcmsStCiap;
   }

   public void setVlrIcmsStCiap(BigDecimal vlrIcmsStCiap) {
        markAsChanged("VLRICMSSTCIAP", vlrIcmsStCiap);
        this.vlrIcmsStCiap = vlrIcmsStCiap;
   }

   public BigDecimal getVlrSaldo() {
        return vlrSaldo;
   }

   public void setVlrSaldo(BigDecimal vlrSaldo) {
        markAsChanged("VLRSALDO", vlrSaldo);
        this.vlrSaldo = vlrSaldo;
   }

   public String getCodBem() {
        return codBem;
   }

   public void setCodBem(String codBem) {
        markAsChanged("CODBEM", codBem);
        this.codBem = codBem;
   }

   public String getCodBemAtual() {
        return codBemAtual;
   }

   public void setCodBemAtual(String codBemAtual) {
        markAsChanged("CODBEMATUAL", codBemAtual);
        this.codBemAtual = codBemAtual;
   }

   public String getCodBemOrig() {
        return codBemOrig;
   }

   public void setCodBemOrig(String codBemOrig) {
        markAsChanged("CODBEMORIG", codBemOrig);
        this.codBemOrig = codBemOrig;
   }

   public BigDecimal getCodDep() {
        return codDep;
   }

   public void setCodDep(BigDecimal codDep) {
        markAsChanged("CODDEP", codDep);
        this.codDep = codDep;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
        this.codEmp = codEmp;
   }

   public Timestamp getDtIniRefCiap() {
        return dtIniRefCiap;
   }

   public void setDtIniRefCiap(Timestamp dtIniRefCiap) {
        markAsChanged("DTINIREFCIAP", dtIniRefCiap);
        this.dtIniRefCiap = dtIniRefCiap;
   }

   public BigDecimal getCodLocal() {
        return codLocal;
   }

   public void setCodLocal(BigDecimal codLocal) {
        markAsChanged("CODLOCAL", codLocal);
        this.codLocal = codLocal;
   }

   public BigDecimal getCodPossuidor() {
        return codPossuidor;
   }

   public void setCodPossuidor(BigDecimal codPossuidor) {
        markAsChanged("CODPOSSUIDOR", codPossuidor);
        this.codPossuidor = codPossuidor;
   }

   public BigDecimal getCodProd() {
        return codProd;
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
        this.codProd = codProd;
   }

   public String getDescrAbrev() {
        return descrAbrev;
   }

   public void setDescrAbrev(String descrAbrev) {
        markAsChanged("DESCRABREV", descrAbrev);
        this.descrAbrev = descrAbrev;
   }

   public String getDescrBem() {
        return descrBem;
   }

   public void setDescrBem(String descrBem) {
        markAsChanged("DESCRBEM", descrBem);
        this.descrBem = descrBem;
   }

   public BigDecimal getAliqCofins() {
        return aliqCofins;
   }

   public void setAliqCofins(BigDecimal aliqCofins) {
        markAsChanged("ALIQCOFINS", aliqCofins);
        this.aliqCofins = aliqCofins;
   }

   public BigDecimal getAliqPis() {
        return aliqPis;
   }

   public void setAliqPis(BigDecimal aliqPis) {
        markAsChanged("ALIQPIS", aliqPis);
        this.aliqPis = aliqPis;
   }

   public BigDecimal getCstCofins() {
        return cstCofins;
   }

   public void setCstCofins(BigDecimal cstCofins) {
        markAsChanged("CSTCOFINS", cstCofins);
        this.cstCofins = cstCofins;
   }

   public BigDecimal getCstPis() {
        return cstPis;
   }

   public void setCstPis(BigDecimal cstPis) {
        markAsChanged("CSTPIS", cstPis);
        this.cstPis = cstPis;
   }

   public String getDescrUtilBem() {
        return descrUtilBem;
   }

   public void setDescrUtilBem(String descrUtilBem) {
        markAsChanged("DESCRUTILBEM", descrUtilBem);
        this.descrUtilBem = descrUtilBem;
   }

   public Timestamp getDtFimAj() {
        return dtFimAj;
   }

   public void setDtFimAj(Timestamp dtFimAj) {
        markAsChanged("DTFIMAJ", dtFimAj);
        this.dtFimAj = dtFimAj;
   }

   public Timestamp getDtInicioAj() {
        return dtInicioAj;
   }

   public void setDtInicioAj(Timestamp dtInicioAj) {
        markAsChanged("DTINICIOAJ", dtInicioAj);
        this.dtInicioAj = dtInicioAj;
   }

   public BigDecimal getNParcPisCof() {
        return nParcPisCof;
   }

   public void setNParcPisCof(BigDecimal nParcPisCof) {
        markAsChanged("NPARCPISCOF", nParcPisCof);
        this.nParcPisCof = nParcPisCof;
   }

   public String getPisCofMp540() {
        return pisCofMp540;
   }

   public void setPisCofMp540(String pisCofMp540) {
        markAsChanged("PISCOFMP540", pisCofMp540);
        this.pisCofMp540 = pisCofMp540;
   }

   public BigDecimal getSaldo() {
        return saldo;
   }

   public void setSaldo(BigDecimal saldo) {
        markAsChanged("SALDO", saldo);
        this.saldo = saldo;
   }

   public String getTemAj() {
        return temAj;
   }

   public void setTemAj(String temAj) {
        markAsChanged("TEMAJ", temAj);
        this.temAj = temAj;
   }

   public String getTemCredPisCofinsDepr() {
        return temCredPisCofinsDepr;
   }

   public void setTemCredPisCofinsDepr(String temCredPisCofinsDepr) {
        markAsChanged("TEMCREDPISCOFINSDEPR", temCredPisCofinsDepr);
        this.temCredPisCofinsDepr = temCredPisCofinsDepr;
   }

   public String getTipoEntCiap() {
        return tipoEntCiap;
   }

   public void setTipoEntCiap(String tipoEntCiap) {
        markAsChanged("TIPOENTCIAP", tipoEntCiap);
        this.tipoEntCiap = tipoEntCiap;
   }

   public BigDecimal getUtilImob() {
        return utilImob;
   }

   public void setUtilImob(BigDecimal utilImob) {
        markAsChanged("UTILIMOB", utilImob);
        this.utilImob = utilImob;
   }

   public BigDecimal getVlrCompraAquisicao() {
        return vlrCompraAquisicao;
   }

   public void setVlrCompraAquisicao(BigDecimal vlrCompraAquisicao) {
        markAsChanged("VLRCOMPRAAQUISICAO", vlrCompraAquisicao);
        this.vlrCompraAquisicao = vlrCompraAquisicao;
   }

   public BigDecimal getVlrDepAj() {
        return vlrDepAj;
   }

   public void setVlrDepAj(BigDecimal vlrDepAj) {
        markAsChanged("VLRDEPAJ", vlrDepAj);
        this.vlrDepAj = vlrDepAj;
   }

   public BigDecimal getVlrSaldoAj() {
        return vlrSaldoAj;
   }

   public void setVlrSaldoAj(BigDecimal vlrSaldoAj) {
        markAsChanged("VLRSALDOAJ", vlrSaldoAj);
        this.vlrSaldoAj = vlrSaldoAj;
   }

   public BigDecimal getVlrTotDespesaBem() {
        return vlrTotDespesaBem;
   }

   public void setVlrTotDespesaBem(BigDecimal vlrTotDespesaBem) {
        markAsChanged("VLRTOTDESPESABEM", vlrTotDespesaBem);
        this.vlrTotDespesaBem = vlrTotDespesaBem;
   }

   public BigDecimal getVidaUtil() {
        return vidaUtil;
   }

   public void setVidaUtil(BigDecimal vidaUtil) {
        markAsChanged("VIDAUTIL", vidaUtil);
        this.vidaUtil = vidaUtil;
   }

   public BigDecimal getCodProdOrig() {
        return codProdOrig;
   }

   public void setCodProdOrig(BigDecimal codProdOrig) {
        markAsChanged("CODPRODORIG", codProdOrig);
        this.codProdOrig = codProdOrig;
   }

   public BigDecimal getCodUsuDesmembramento() {
        return codUsuDesmembramento;
   }

   public void setCodUsuDesmembramento(BigDecimal codUsuDesmembramento) {
        markAsChanged("CODUSUDESMEMBRAMENTO", codUsuDesmembramento);
        this.codUsuDesmembramento = codUsuDesmembramento;
   }

   public Timestamp getDhDesmembramento() {
        return dhDesmembramento;
   }

   public void setDhDesmembramento(Timestamp dhDesmembramento) {
        markAsChanged("DHDESMEMBRAMENTO", dhDesmembramento);
        this.dhDesmembramento = dhDesmembramento;
   }

   public BigDecimal getNuNotaOrigDesmemb() {
        return nuNotaOrigDesmemb;
   }

   public void setNuNotaOrigDesmemb(BigDecimal nuNotaOrigDesmemb) {
        markAsChanged("NUNOTAORIGDESMEMB", nuNotaOrigDesmemb);
        this.nuNotaOrigDesmemb = nuNotaOrigDesmemb;
   }

   public BigDecimal getVlrExcBaseCred() {
        return vlrExcBaseCred;
   }

   public void setVlrExcBaseCred(BigDecimal vlrExcBaseCred) {
        markAsChanged("VLREXCBASECRED", vlrExcBaseCred);
        this.vlrExcBaseCred = vlrExcBaseCred;
   }

   public BigDecimal getCodUsuCompra() {
        return codUsuCompra;
   }

   public void setCodUsuCompra(BigDecimal codUsuCompra) {
        markAsChanged("CODUSUCOMPRA", codUsuCompra);
        this.codUsuCompra = codUsuCompra;
   }

   public Timestamp getDhAlterCompra() {
        return dhAlterCompra;
   }

   public void setDhAlterCompra(Timestamp dhAlterCompra) {
        markAsChanged("DHALTERCOMPRA", dhAlterCompra);
        this.dhAlterCompra = dhAlterCompra;
   }

   public String getDigitadoCompra() {
        return digitadoCompra;
   }

   public void setDigitadoCompra(String digitadoCompra) {
        markAsChanged("DIGITADOCOMPRA", digitadoCompra);
        this.digitadoCompra = digitadoCompra;
   }

   public BigDecimal getVlrCofinsCompra() {
        return vlrCofinsCompra;
   }

   public void setVlrCofinsCompra(BigDecimal vlrCofinsCompra) {
        markAsChanged("VLRCOFINSCOMPRA", vlrCofinsCompra);
        this.vlrCofinsCompra = vlrCofinsCompra;
   }

   public BigDecimal getVlrCompraAquisicaoCalc() {
        return vlrCompraAquisicaoCalc;
   }

   public void setVlrCompraAquisicaoCalc(BigDecimal vlrCompraAquisicaoCalc) {
        markAsChanged("VLRCOMPRAAQUISICAOCALC", vlrCompraAquisicaoCalc);
        this.vlrCompraAquisicaoCalc = vlrCompraAquisicaoCalc;
   }

   public BigDecimal getVlrIcmsCiapCalc() {
        return vlrIcmsCiapCalc;
   }

   public void setVlrIcmsCiapCalc(BigDecimal vlrIcmsCiapCalc) {
        markAsChanged("VLRICMSCIAPCALC", vlrIcmsCiapCalc);
        this.vlrIcmsCiapCalc = vlrIcmsCiapCalc;
   }

   public BigDecimal getVlrIcmsStCiapCalc() {
        return vlrIcmsStCiapCalc;
   }

   public void setVlrIcmsStCiapCalc(BigDecimal vlrIcmsStCiapCalc) {
        markAsChanged("VLRICMSSTCIAPCALC", vlrIcmsStCiapCalc);
        this.vlrIcmsStCiapCalc = vlrIcmsStCiapCalc;
   }

   public BigDecimal getVlrPisCompra() {
        return vlrPisCompra;
   }

   public void setVlrPisCompra(BigDecimal vlrPisCompra) {
        markAsChanged("VLRPISCOMPRA", vlrPisCompra);
        this.vlrPisCompra = vlrPisCompra;
   }

   @Override
   public String getTableName() {
        return "TCIBEM";
   }

   @Override
   public String getEntityName() {
        return "Imobilizado";
   }

   @Override
   public Imobilizado fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.descrLocal = vo.asString("DESCRLOCAL");
        this.dtBaixa = vo.asTimestamp("DTBAIXA");
        this.dtCompra = vo.asTimestamp("DTCOMPRA");
        this.dtFimDep = vo.asTimestamp("DTFIMDEP");
        this.dtFimRefCiap = vo.asTimestamp("DTFIMREFCIAP");
        this.dtInicioDep = vo.asTimestamp("DTINICIODEP");
        this.nuNota = vo.asBigDecimal("NUNOTA");
        this.nuNotaBaixa = vo.asBigDecimal("NUNOTABAIXA");
        this.valorPresente = vo.asBigDecimal("VALORPRESENTE");
        this.vlrDepOrig = vo.asBigDecimal("VLRDEPORIG");
        this.dtRetorno = vo.asTimestamp("DTRETORNO");
        this.nfDevVenda = vo.asBigDecimal("NFDEVVENDA");
        this.nfRetorno = vo.asBigDecimal("NFRETORNO");
        this.nfSaida = vo.asBigDecimal("NFSAIDA");
        this.nomePossuidor = vo.asString("NOMEPOSSUIDOR");
        this.numContrato = vo.asBigDecimal("NUMCONTRATO");
        this.numNota = vo.asBigDecimal("NUMNOTA");
        this.numNotaBaixa = vo.asBigDecimal("NUMNOTABAIXA");
        this.nuNotaDev = vo.asBigDecimal("NUNOTADEV");
        this.nuNotaDevVenda = vo.asBigDecimal("NUNOTADEVVENDA");
        this.nuNotaSaida = vo.asBigDecimal("NUNOTASAIDA");
        this.qtdMesesCiap = vo.asBigDecimal("QTDMESESCIAP");
        this.temDepreciacao = vo.asString("TEMDEPRECIACAO");
        this.vlrAquisicao = vo.asBigDecimal("VLRAQUISICAO");
        this.vlrDep = vo.asBigDecimal("VLRDEP");
        this.vlrIcmsCiap = vo.asBigDecimal("VLRICMSCIAP");
        this.vlrIcmsDifCiap = vo.asBigDecimal("VLRICMSDIFCIAP");
        this.vlrIcmsFrtCiap = vo.asBigDecimal("VLRICMSFRTCIAP");
        this.vlrIcmsStCiap = vo.asBigDecimal("VLRICMSSTCIAP");
        this.vlrSaldo = vo.asBigDecimal("VLRSALDO");
        this.codBem = vo.asString("CODBEM");
        this.codBemAtual = vo.asString("CODBEMATUAL");
        this.codBemOrig = vo.asString("CODBEMORIG");
        this.codDep = vo.asBigDecimal("CODDEP");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.dtIniRefCiap = vo.asTimestamp("DTINIREFCIAP");
        this.codLocal = vo.asBigDecimal("CODLOCAL");
        this.codPossuidor = vo.asBigDecimal("CODPOSSUIDOR");
        this.codProd = vo.asBigDecimal("CODPROD");
        this.descrAbrev = vo.asString("DESCRABREV");
        this.descrBem = vo.asString("DESCRBEM");
        this.aliqCofins = vo.asBigDecimal("ALIQCOFINS");
        this.aliqPis = vo.asBigDecimal("ALIQPIS");
        this.cstCofins = vo.asBigDecimal("CSTCOFINS");
        this.cstPis = vo.asBigDecimal("CSTPIS");
        this.descrUtilBem = vo.asString("DESCRUTILBEM");
        this.dtFimAj = vo.asTimestamp("DTFIMAJ");
        this.dtInicioAj = vo.asTimestamp("DTINICIOAJ");
        this.nParcPisCof = vo.asBigDecimal("NPARCPISCOF");
        this.pisCofMp540 = vo.asString("PISCOFMP540");
        this.saldo = vo.asBigDecimal("SALDO");
        this.temAj = vo.asString("TEMAJ");
        this.temCredPisCofinsDepr = vo.asString("TEMCREDPISCOFINSDEPR");
        this.tipoEntCiap = vo.asString("TIPOENTCIAP");
        this.utilImob = vo.asBigDecimal("UTILIMOB");
        this.vlrCompraAquisicao = vo.asBigDecimal("VLRCOMPRAAQUISICAO");
        this.vlrDepAj = vo.asBigDecimal("VLRDEPAJ");
        this.vlrSaldoAj = vo.asBigDecimal("VLRSALDOAJ");
        this.vlrTotDespesaBem = vo.asBigDecimal("VLRTOTDESPESABEM");
        this.vidaUtil = vo.asBigDecimal("VIDAUTIL");
        this.codProdOrig = vo.asBigDecimal("CODPRODORIG");
        this.codUsuDesmembramento = vo.asBigDecimal("CODUSUDESMEMBRAMENTO");
        this.dhDesmembramento = vo.asTimestamp("DHDESMEMBRAMENTO");
        this.nuNotaOrigDesmemb = vo.asBigDecimal("NUNOTAORIGDESMEMB");
        this.vlrExcBaseCred = vo.asBigDecimal("VLREXCBASECRED");
        this.codUsuCompra = vo.asBigDecimal("CODUSUCOMPRA");
        this.dhAlterCompra = vo.asTimestamp("DHALTERCOMPRA");
        this.digitadoCompra = vo.asString("DIGITADOCOMPRA");
        this.vlrCofinsCompra = vo.asBigDecimal("VLRCOFINSCOMPRA");
        this.vlrCompraAquisicaoCalc = vo.asBigDecimal("VLRCOMPRAAQUISICAOCALC");
        this.vlrIcmsCiapCalc = vo.asBigDecimal("VLRICMSCIAPCALC");
        this.vlrIcmsStCiapCalc = vo.asBigDecimal("VLRICMSSTCIAPCALC");
        this.vlrPisCompra = vo.asBigDecimal("VLRPISCOMPRA");
        return this;
   }
}
